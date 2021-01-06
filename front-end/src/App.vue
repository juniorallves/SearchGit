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


  <v-layout row wrap> 
    <div id="box">
      <div>
        <div id="left"><h6>Github</h6></div>
        <div id="rigth"><p>Search</p></div>
      </div>  
      <div id="photo">
      <img src="./assets/Tey_7.jpg" width="170" height="220"/>
      </div>
      <div id="mad">
      <div id="top"><p>juniorallves</p></div>
      <div id="bot"><p>juniorallves</p></div>
      </div>
      <div id="mid">
        <p><v-icon style="color:#363636">mdi-briefcase-variant</v-icon> Lux One</p>
        <p><v-icon style="color:#363636">mdi-map-marker-radius-outline</v-icon> Fortaleza</p>
        <p><v-icon style="color:#363636">mdi-star-outline</v-icon> 0</p>
        <p><v-icon style="color:#363636">mdi-archive</v-icon> 4</p>
        <p><v-icon style="color:#363636">mdi-account-supervisor-outline</v-icon> 1</p>
      </div>  
    </div>

    <v-row id="direita" align="center">
            <v-col cols="6">
              <v-autocomplete v-model="value" :items="items" dense filled label="Sexo delicioso" append-icon="mdi-magnify">
              </v-autocomplete>
            </v-col>
          </v-row>
    <div>
    <div id="centro">  
      <div class="col-12" v-for="item in items" :key="item.estrela">
        <h4>{{item.titulo }}</h4>
        <span class="gray">{{item.descricao }}</span>
        <div class="gray">{{item.estrela }}</div>
      </div>
    </div>     
    </div>   
  </v-layout>
 </v-container>
</template>

<script>
//import HelloWorld from './components/HelloWorld';

export default {
  name: 'App',

  components: {
    //HelloWorld,
  },
  el: '#example-1',
  data: () => ({
    items: [
      {titulo: 'Angula-AdminLTE'},
      {descricao: 'AngularjsApp Implementation on top of renowned Admin-LTE theme (https://github.com/juniorallves/Vendas) now with many useful directives and features' },
      {estrela: 0},
      {titulo: 'python-docs-hello-world'},
      {descricao: 'A simple python application for docs' },
      {estrela: 0},
      {titulo: 'rakepython'},
      {descricao: 'I really do not know' },
      {estrela: 0},
      {titulo: 'rk_tut'},
      {descricao: 'I do not know' },
      {estrela: 0}
    ]
  }),
};
</script>
<style scoped>
#resize{
  padding: 0;
}
#box{
  height: 100px;
  width: 60%;
  position: absolute;
  left: 40%;
  top: 20%;
  transform: translate(-50%, -50%);
}
.icon{
  display: flex;
}
#top{
  font-size: 25px;
}
#bot{
  font-size: 17px;
  color: gray;
}
#mid{
  margin-top:3%;
  color: gray;    
}
#mad{
  margin-top:15%;
}
#direita{
    height: 100px;
    width: 60%;
    position: absolute;
    left: 100%;
    top: 14%;
    transform: translate(-50%, -50%);
}
#centro{
    height: 100px;
    width: 60%;
    position: absolute;
    left: 57%;
    top: 24%;
    transform: translate(-50%, -50%);
}
.gray{
  color: gray;
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
#photo{
  width: 100px;
  height: 100px;
}
#left{
  display: inline-block;
  padding-right: 2%;
  font-size: 37px;
}
#rigth{   
  display: inline-block;
  float:center;
  font-size: 27px;
}
h1{
  font-size: 100px;
}

</style>
