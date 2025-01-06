import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { ProductAdminComponent } from '../product-admin/product-admin.component';
import { CommonModule } from '@angular/common'; 
import { UserAdminComponent } from '../user-admin/user-admin.component';
import { CustomerComponent } from '../customer/customer.component';
import { VourcherComponent } from '../vourcher/vourcher.component';
import { StatisticsComponent } from '../statistics/statistics.component';
import { InvoiceComponent } from '../invoice/invoice.component';

@Component({
  selector: 'app-home-admin',
  standalone: true,
  imports: [RouterModule,ProductAdminComponent,CommonModule,UserAdminComponent,CustomerComponent,VourcherComponent,StatisticsComponent,InvoiceComponent],
  templateUrl: './home-admin.component.html',
  styleUrl: './home-admin.component.scss'
})
export class HomeAdminComponent {
  selectedComponent: string = 'dashboard';  // Mặc định hiển thị trang dashboard
  selectedNav: string = 'dashboard';  // Điều khiển mục active trên sidebar

  showComponent(component: string) {
    this.selectedComponent = component;
    this.selectedNav = component;
  }

  logout() {
    console.log('Logout thành công!');
  }
  
}
