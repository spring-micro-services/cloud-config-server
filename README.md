# cloud-config-server
Configuration Server which manages config-repo 


Micro Services Configuration used to manage configuration globally with High availability services like github.com


This is the configuration server to centralize the configuration properties
 
 *###################################
 *  CENTRALIZED LOG CONFIGURATION
 *###################################
 *  This application configured with ELK Stack for centralized logging
 *
 *  1. brew install logstash
 *  2. brew install elasticsearch
 *  3. brew install kibana
 *  4. elasticsearch   => to start on port 9200
 *  5. logstash -f logstash.conf on port 9600
 *  6. kibana on port 5601
 *
 *###################################
 *
 *