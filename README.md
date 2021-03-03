# Melodies App

<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="">
    <img src="public/MelodiesLogo.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">Melodies App</h3>

  <p align="center">
    A Music App Allows Users To Listen, Explore And Search For Their Music !
    <br />
    <a href="https://pages.git.generalassemb.ly/xloli20/MelodiesAppFrontEnd/"><strong>Go to the app »</strong></a>
    <br />
    <br />
    <a href="https://git.generalassemb.ly/xloli20/MelodiesAppBackEnd">Melodies App Back End</a>
    ·
    <a href="http://melodieswebapp-env.eba-kgzwebax.us-east-2.elasticbeanstalk.com/">API URL</a>
  </p>
</p>

<!-- ABOUT THE PROJECT -->
## About The Project

Melodies is a music app that allows the user to listen, explore and search for their music (the data will be fetched from a third-party API). And the user can click on a (heart icon) to store her/his favorite song so s/he can reach it easily. Also, there's a (plus icon) with a dropdown list so the user can add the song to one of her/his pre-created playlists. and if s/he doesn't have there's a button to redirect them to add playlist page. Also, the users can add their own custom song by filling the form if it's not in the API. The user also can delete/unfavorite, edit their song/playlist.

### Relational Database Design(ERD)
![](image.png)

### Routes

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
|GET | /playlist/detail | none | id 
|POST  | /playlist/add | playlist | none
|PUT | /playlist/edit | playlist | none
|DELETE | /playlist/delete | none | id
