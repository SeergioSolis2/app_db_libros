import { Component } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],

})
export class AppComponent {
  title = 'app_db_libros';
  constructor() {
    this.loadScripts();
  }
 
  // Method to dynamically load JavaScript
  loadScripts() {
 
    // This array contains all the files/CDNs
    const dynamicScripts = [
       'script/Login.js'
    ];
    for (let i = 0; i < dynamicScripts.length; i++) {
      const node = document.createElement('script');
      node.src = dynamicScripts[i];
      node.type = 'text/javascript';
      node.async = false;
    };
  }

}
