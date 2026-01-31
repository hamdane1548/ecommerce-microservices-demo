🚀 Microservices Cloud-Native Architecture Project

Author: Oussama Hamdane

📌 Overview

This project demonstrates the implementation of a secure microservices architecture ready for deployment in cloud environments. It is designed to support Cloud-Native applications, following the 15 best practices for cloud-native application methodology.

The main goal is to build an environment-independent architecture, where each microservice automatically receives the appropriate configuration, with real-time configuration propagation.

🎯 Project Objectives

Environment-Independent Architecture
Each microservice can run in different environments without modifying the source code.

Dynamic Configuration Propagation
New configurations are propagated in real-time, without restarting service instances.

Secure Inter-Service Communication
Microservices communicate using RabbitMQ and Spring Cloud Bus.

Automation via GitHub Webhooks
Any push to the configuration repository triggers automatic propagation of the new configurations to all instances.

🛠️ Technologies Used
Technology	Role in the Project
Spring Boot	Microservices development
Spring Cloud	Service management, resilience, and service discovery
Spring Cloud Config	Centralized configuration management
Spring Cloud Bus	Real-time propagation of configuration changes
RabbitMQ	Message broker for inter-service communication
MySQL	Relational database
Hookdeck	GitHub webhook management for automatic configuration updates
📈 Benefits

Environment-independent codebase

Real-time configuration updates

Scalable and secure architecture

Perfect for modern cloud-native applications

🔗 Architecture Diagram
![images.png](images/images.png)