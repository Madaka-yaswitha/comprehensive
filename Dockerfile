FROM openjdk
EXPOSE 8034
COPY target/ComprehensiveAssessment-0.0.1-SNAPSHOT.jar ComprehensiveAssessment-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", ComprehensiveAssessment-0.0.1-SNAPSHOT.jar]