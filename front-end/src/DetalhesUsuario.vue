<template  xmlns:v-slot="http://www.w3.org/1999/XSL/Transform">
 <v-container id="resize" grid-list-xl fluid> 
  <div>
  <v-app id="inspire">
    <div>
      <v-app-bar
        color="black accent-4"
        dense
        dark
      >
        <v-app-bar-nav-icon></v-app-bar-nav-icon>
  
        <v-toolbar-title>Page title</v-toolbar-title>
  
        <v-spacer></v-spacer>
  
        <v-menu
          left
          bottom
        >
          <template v-slot:activator="{ on, attrs }">
            <v-btn
              icon
              v-bind="attrs"
              v-on="on"
            >
              <v-icon>mdi-dots-vertical</v-icon>
            </v-btn>
          </template>
  
          <v-list>
            <v-list-item
              v-for="n in 5"
              :key="n"
              @click="() => {}"
            >
              <v-list-item-title>Option {{ n }}</v-list-item-title>
              </v-list-item>
            </v-list>
          </v-menu>
        </v-app-bar>
      </div>
    </v-app>
  </div>


  <div id="centro">
  <div id="botom">
    <v-app id="inspire">
      <div>
      <div id="left">
      <h1> Github</h1></div><div id="rigth"><p>Search</p></div></div>
      <v-card>
        <v-container fluid>
          <v-row
            align="center"
          >
            <v-col cols="12">
              <v-autocomplete v-model="usuario" :items="items" dense filled label="Sexo delicioso" append-icon="mdi-magnify"
              ></v-autocomplete>
            </v-col>
          </v-row>
        </v-container>
      </v-card>
    </v-app>
  </div>
    
  </div>
 </v-container>
</template>

<script>
//import HelloWorld from './components/HelloWorld';

export default {
  name: 'App',

  components: {
    //HelloWorld,
  },

  data: () => ({
    items: [
      {usuario: 'juin'},
      {usuario: 'joseff Bussy' },
      {usuario: 'joseff awqw' }
    ]
  }),
};
</script>
<style scoped>
#resize{
  padding: 0;
}
#centro{
    height: 100px;
    width: 60%;
    position: absolute;
    left: 50%;
    top: 50%;
    transform: translate(-50%, -50%);
}
.flex-box {
  display: flex;
  align-items: center;
  justify-content: center;
}
.container-box {
  background-color: yellow;
  height: 300px;
}
#botom{
  margin-top:-14%;
}
#left{
  display: inline-block;
  padding-left: 16%;
  padding-right: 3%;
}
#rigth{   
  display: inline-block;
  float:center;
}
h1{
  font-size: 100px;
}
p{
  font-size: 90px;
}
</style>
