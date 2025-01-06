import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { ShoppingCartComponent } from '../shopping-cart/shopping-cart.component';


@Component({
  selector: 'app-header',
  standalone: true,
  imports: [CommonModule, RouterModule, ShoppingCartComponent],
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent {
  isShoppingCartOpen: boolean = false;

  toggleShoppingCart() {
    this.isShoppingCartOpen = !this.isShoppingCartOpen;
  }

  closeShoppingCart() {
    this.isShoppingCartOpen = false;
  }
}
