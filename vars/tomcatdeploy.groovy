def call(ip,user,credId){
  sshagent([credId]) {
   sh "mv target/myweb-0.0.9.war target/app1.war"
   // copy war
   sh "scp -o StrictHostKeyChecking=no target/app1.war ${user}@${ip}:/opt/tomcat9999/webapps"
   //stop tomcat
   sh "ssh ${user}@${ip} /opt/tomcat9999/bin/shutdown.sh"
   //start tomcat
   sh "ssh ${user}@${ip} /opt/tomcat9999/bin/startup.sh"
  }
}
