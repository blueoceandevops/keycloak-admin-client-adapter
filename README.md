# Keycloak Admin Client Adapter

This adapter provides convenience methods to register and login users to keycloak. It's based on the official 
keycloak admin client to work with a keycloak server from a microprofile based microservice.

### MP-Config-Parameter:

The following required configuration must be provided by the 'microprofile-config.properties'

#### Keycloak adapter configuration {KeycloakAdapterConfiguration.java}
keycloak.adapter.serverUrl=<KEYCLOAK_URL>
keycloak.adapter.masterRealm=<KEYCLOAK_MASTER_REALM>
keycloak.adapter.admin.clientId=<KEYCLOAK_REALM_CLIENT_ID>
keycloak.adapter.admin.username=<KEYCLOAK_REALM_USER>
keycloak.adapter.admin.password=<KEYCLOAK_REALM_PASSWORD>
keycloak.adapter.grantType=<KEYCLOAK_GRANT_TYPE: example = password>
keycloak.adapter.connectionPoolSize=<KEYCLOAK_CONNECTION_POOL_SIZE: example = 5>

#### Keycloak key configuration {KeycloakKeyConfiguration.java}
keycloak.keyPair.filename.publicKey=<KEYCLOAK_PUBLIC_KEY_FILENAME: example = public.key>
keycloak.keyPair.filename.privateKey=<KEYCLOAK_PRIVATE_KEY_FILENAME: example = private.key>
keycloak.keyPair.tokenSecret=<KEYCLOAK_PUBLIC_TOKEN_SECRET: example = bg601f81f747428166e90541603frade>
keycloak.keyPair.algorithm=<KEYCLOAK_KEY_ALGORITHM: example = RSA>

#### Keycloak login service configuration {KeycloakLoginService.java}
keycloak.login.realm=<KEYCLOAK_REALM>
keycloak.login.clientId=<KEYCLOAK_REALM_CLIENT_ID>

#### Keycloak registration service configuration {KeycloakRegistrationService.java}
keycloak.registration.realm=<KEYCLOAK_REALM>
keycloak.registration.clientId=<KEYCLOAK_REALM_CLIENT_ID>
keycloak.registration.mode=<KEYCLOAK_REGISTRATION_MODE: example = DOUBLE_OPT_IN>
keycloak.registration.roleRequire=<KEYCLOAK_REGISTRATION_ROLE_REQUIRED: example = true>



