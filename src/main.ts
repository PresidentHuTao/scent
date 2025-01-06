import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { AppComponent } from './app/app.component';
import { HomeComponent } from './app/home/home.component';
import { ProductComponent } from './app/product/product.component';
import { ProductDetailComponent } from './app/product-detail/product-detail.component';
import { OrderComponent } from './app/order/order.component';
import { HomeAdminComponent } from './app/admin/home-admin/home-admin.component';


bootstrapApplication(HomeAdminComponent, appConfig)
  .catch((err) => console.error(err));
