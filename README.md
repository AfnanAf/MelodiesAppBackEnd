# Melodies App Back End
![](image.png)

## Routes

|Method        | Route Path            | Request Body       | Request Parameter |
|:--         | :--             | :--         | :-- |
|GET | /user/index | none | none 
|GET | /user/profile | none | email 
|POST  | /user/registration | user | none
|POST | /user/login | user | none
|PUT | /user/edit | user | email
|PUT | /user/changePassword | user | currentPassword
|DELETE | /user/delete | none | id

|GET | /song/index | none | none 
|POST  | /song/add | song | none
|PUT | /song/edit | song | none
|DELETE | /song/delete | none | id

|GET | /playlist/index | none | none 
|POST  | /playlist/add | playlist | none
|PUT | /playlist/edit | playlist | none
|DELETE | /playlist/delete | none | id
