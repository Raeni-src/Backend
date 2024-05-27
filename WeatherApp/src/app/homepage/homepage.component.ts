import { Component } from '@angular/core';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { faSearch } from '@fortawesome/free-solid-svg-icons'

@Component({
  selector: 'app-homepage',
  standalone: true,
  imports: [FontAwesomeModule],
  templateUrl: './homepage.component.html',
  styleUrl: './homepage.component.css'
})
export class HomepageComponent {
  backgroundUrl = 'assets/images/background.jpg'; 
  faSearch= faSearch;
}
