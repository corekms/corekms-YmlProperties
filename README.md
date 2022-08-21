# YmlProperties
apllication.yml
spring:
  profiles:
    active: prod

---
spring:
  config:
    activate:
      on-profile: dev
app:
  team: hi
  team-size: 1
  team-leader: dev

---
spring:
  config:
    activate:
      on-profile: staging
app:
  team: hi
  team-size: 2
  team-leader: staging

---
spring:
  config:
    activate:
      on-profile: prod    
app:
  team: hi
  team-size: 3
  team-leader: prod