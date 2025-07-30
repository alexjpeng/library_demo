# Spring Boot Security Update

## Overview
Updated Spring Boot from version 2.2.0.M6 to 2.7.18 to fix critical security vulnerabilities.

## Security Vulnerabilities Fixed

### CVE-2023-20873 (CVSS 9.8)
- **Description**: In Spring Boot versions 3.0.0 - 3.0.5, 2.7.0 - 2.7.10, and older unsupported versions, an application that is deployed to Cloud Foundry could be susceptible to a security bypass.
- **Fixed in**: Spring Boot 2.7.11+
- **Impact**: Critical security bypass vulnerability

### CVE-2023-20883
- **Description**: In Spring Boot versions 3.0.0 - 3.0.6, 2.7.0 - 2.7.11, 2.6.0 - 2.6.14, 2.5.0 - 2.5.14 and older unsupported versions, there is potential for a denial-of-service (DoS) attack if Spring MVC is used together with a reverse proxy cache.
- **Fixed in**: Spring Boot 2.7.12+
- **Impact**: Denial of Service vulnerability

### CVE-2022-27772
- **Description**: Spring Boot versions prior to v2.2.11.RELEASE was vulnerable to temporary directory hijacking. This vulnerability impacted the org.springframework.boot.web.server.AbstractConfigurableWebServerFactory.createTempDir method.
- **Fixed in**: Spring Boot 2.2.11+
- **Impact**: Temporary directory hijacking vulnerability

## Changes Made

### Version Updates
- **Spring Boot Parent**: 2.2.0.M6 → 2.7.18
- **Spring HATEOAS**: 1.0.0.BUILD-SNAPSHOT → 1.5.6
- **Lombok**: 1.18.4 → 1.18.30
- **H2 Database**: 1.4.197 → 2.1.214
- **Maven Surefire Plugin**: 2.20 → 2.22.2
- **Maven Failsafe Plugin**: 2.22.1 → 2.22.2

### Repository Configuration
- Removed spring-libs-snapshot repository (no longer needed for stable releases)
- Removed repository.spring.milestone repository (no longer needed for stable releases)
- Removed spring-libs-snapshot plugin repository
- Removed repository.spring.release plugin repository
- Removed repository.spring.milestone plugin repository

### Dependency Management
- All Spring Boot dependencies now use BOM (Bill of Materials) version management
- Consistent versions across all Spring Boot components
- Updated related dependencies for compatibility with Spring Boot 2.7.18

## Breaking Changes
None identified. The upgrade from Spring Boot 2.2.0.M6 to 2.7.18 maintains backward compatibility within the 2.x line and preserves Java 11 compatibility.

## Verification
- ✅ Application compiles successfully
- ✅ All existing tests pass
- ✅ OWASP dependency check confirms no Spring Boot CVEs with CVSS >= 7.0
- ✅ Application starts successfully
- ✅ Health endpoint responds correctly

## Notes
- Chose Spring Boot 2.7.18 over 3.x to maintain Java 11 compatibility
- Avoided javax → jakarta namespace migration complexity
- Used Spring Boot BOM approach for consistent dependency version management
- All critical security vulnerabilities have been resolved
