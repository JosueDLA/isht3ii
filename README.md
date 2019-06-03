# Ingenieria de Software Hoja de Trabajo #3 Parte II
Hoja de trabajo #3 Parte II Ingeniería de Software


 Alumno: Josué Ismael de León Azurdia
 
 Carne: 1290-15-11788

Unit Testing with Palindromes
- Basic Input - Basic Output
- Empty Input - True Output
- Uneven Input - Basic Output
- String With Spaces - Basic Output
- MixedCaseInput - False Output
- Upper Case Input - Basic Output
- Special Characters Input - Basic Output
- Single Character Input - Basic Output
- Tabbed Input - Basic Output
- Large Input - Basic Output

## Docker
### Docker Containers
* josuedla/isht3ii

### Download Docker Image
```sh
> sudo docker pull josuedla/isht3ii
```

### Run Docker Image 
```sh
> sudo docker run josuedla/isht3ii
```

### Dockerfiles
#### Estudiantes
```sh
FROM openjdk:8-jre-alpine
ADD isht3ii-1.0-SNAPSHOT-jar-with-dependencies.jar isht3ii.jar
CMD ["java", "-jar", "isht3ii.jar"]
```

## Dependency
```xml

```
