import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ProductComponent } from './product/product.component';
// import { ContactComponent } from './contact/contact.component';
// import { NotFoundComponent } from './not-found/not-found.component';

export const routes: Routes = [
  { path: '', component: HomeComponent }, // Trang chủ
  { path: 'product', component: ProductComponent }, // Trang sản phẩm
//   { path: 'lien-he', component: ContactComponent }, // Trang liên hệ
//   { path: '**', component: NotFoundComponent }, // Trang "Không tìm thấy"
];
