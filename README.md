# Comparing different API options in spring boot with kotlin

The goal is to compare OpenAPI/gRPC/GraphQL for service to service communication and
aggregating the apis in a gateway that exposes a GraphQL API. 

**This is currently a work in progress**

Plan:
- [ ] Gateway consumes Graphql APIs
- [ ] Gateway consumes OpenAPI APIs
- [ ] Gateway consumes gRPC APIs
- [ ] Gateway provides Graphql APIs

- [x] Basic user service
- [x] User service exposes GraphQL API
- [ ] User service exposes OpenAPI API
- [ ] User service exposes gRPC API
- [ ] Nicer error handling in user API (more complex types)

- [x] Basic website service
- [x] Website service exposes GraphQL API
- [ ] Website service exposes OpenAPI API
- [ ] Website service exposes gRPC API
- [ ] Nicer error handling in website API (more complex types)

- [ ] Basic statistics service
- [ ] Statistics service exposes GraphQL API
- [ ] Statistics service exposes OpenAPI API
- [ ] Statistics service exposes gRPC API
- [ ] Nicer error handling in statistics API (more complex types)