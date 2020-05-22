import {Role} from '../role/role';

export class Base {
  id?: number;
  login?: string;
  password?: string;
  firstName?: string;
  secondName?: string;
  middleName?: string;
  photo?: Blob;
  roleId?: Role;


}
