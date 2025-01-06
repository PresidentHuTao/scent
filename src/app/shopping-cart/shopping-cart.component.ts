import { Component,OnInit } from '@angular/core';
// import { FooterComponent } from '../footer/footer.component';
// import { HeaderComponent } from '../header/header.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-shopping-cart',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './shopping-cart.component.html',
  styleUrls: ['./shopping-cart.component.scss'] // Sửa thành "styleUrls"
})

export class ShoppingCartComponent implements OnInit{
  ngOnInit() {
    console.log('ShoppingCartComponent loaded');
  }

  
  
}
