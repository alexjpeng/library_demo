# Production Deployment Guide

## Prerequisites
- Java 17+
- PostgreSQL 12+ database
- Application server (Tomcat, etc.)

## Environment Variables
Set the following environment variables for production:

### Required
- `DATABASE_URL` - PostgreSQL connection URL
- `DATABASE_USERNAME` - Database username  
- `DATABASE_PASSWORD` - Database password

### Optional
- `SERVER_PORT` - Application port (default: 8080)
- `LOG_FILE` - Log file path (default: /var/log/library/application.log)
- `METRICS_ENABLED` - Enable Prometheus metrics (default: true)

## Database Setup
1. Create PostgreSQL database:
```sql
CREATE DATABASE library_prod;
CREATE USER library_user WITH PASSWORD 'secure_password';
GRANT ALL PRIVILEGES ON DATABASE library_prod TO library_user;
```

2. Run database migrations (schema files will be applied automatically)

## Security Considerations
- Actuator endpoints are restricted to health, info, metrics, and prometheus
- H2 console is disabled
- Stack traces are not exposed in error responses
- Logging is configured for production use
- Use HTTPS in production (configure reverse proxy)

## Monitoring
- Health check: `/actuator/health`
- Metrics: `/actuator/metrics`
- Prometheus: `/actuator/prometheus`

## Running the Application

### Development
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

### Production
```bash
# Set required environment variables
export DATABASE_URL=jdbc:postgresql://localhost:5432/library_prod
export DATABASE_USERNAME=library_user
export DATABASE_PASSWORD=your_secure_password

mvn spring-boot:run -Dspring-boot.run.profiles=prod
```
