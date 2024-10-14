GOALS
1. Implement a Spring Boot microservice responsible for user management.
2. Implement another Spring Boot microservice responsible for journaling user events.
REQUIREMENTS
User Service
• Include functionalities for user registration, user details retrieval, updating and
deleting user information and managing user roles. (You can use any database to
store the user details)
• Expose RESTful API endpoints for CRUD operations.
• Integrate Spring Security for role-based authentication.
• Publish user events to a Kafka topic named “user-events” for journaling.
Journal Service
• Consume events from user-events Kafka topic, log a message and record them.
(You can use any database to store the journals)
• Implement RESTful API endpoints to retrieve journals.
• Incorporate role-based access control to retrieve journals.
Good to have
• Unit tests
• Integration tests
Documentation
• Create docker compose file to run the entire system.
• Document REST API endpoints.
• Document how to run and test the entire system.