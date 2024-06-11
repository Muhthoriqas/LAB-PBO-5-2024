 if(scanner.hasNextDouble()) { //jika bilangan apapun masuk
                    baris2=scanner.nextDouble();
                    if (baris2 % 1 ==0){ //jika bil. bulat yang masuk
                        bilBulat++;
                    }else {
                        bilDesimal++;
                    }
                }else{ //jika bukan bil. yang masuk
                    System.out.println("Inputan Salah");
                    scanner.next();
                    i--;
                }