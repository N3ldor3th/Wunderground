Business Requirements – Background
A company needs to run an internal weather service providing current weather conditions in
selected locations. The service is intended to be used company-wide in various applications
and services, such as
 Portlets in intranet applications
 Remotely accessible via mobile devices
 Warnings on bad weather linked to corporate trips
Current implementation just proxies the well-known SaaS provider weather service Weather
Underground (Wunderground, http://www.wunderground.com) and does not provide any
additional functionality to clients. Initially, when the service was not used broadly, current
solution was acceptable, but once its usage increased, performance did not meet SLA
(response time, uptime) and internal project for reimplementation was approved.
2 Requirements for New Implementation
Implement a service (The Service) providing current weather conditions in pre-selected
locations. The service primarily loads the data from the Wunderground service (The 3rd Party
Service) and adds some business logic to it
