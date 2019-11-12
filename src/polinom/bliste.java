
package polinom;
class polinom{
int der,kats;
polinom ileri;

public polinom(int der,int kats){
    this.der=der;this.kats=kats;
ileri=null;
}
}
public class bliste{
    polinom bas,son,tmp;
public bliste(){
bas=null;
son=null;
}

void sonaekle(polinom yeni){
    if(yeni.kats>yeni.der){
        if(son==null){
son=yeni;
bas=yeni;}

else {
son.ileri=yeni;
son=yeni;}}
    else {
    son=null;
    }
    System.out.print(yeni.der+"  "+yeni.kats+"===>");
}


void hesapla(int x){
     System.out.println();
double a ;
tmp=bas;
while(tmp!=null){
 a= Math.pow(x, tmp.der)*tmp.kats;

    System.out.print(a+" ==>");
        tmp=tmp.ileri;

}

}
void sirala(polinom gelen){
tmp=bas;

    System.out.println();
while(tmp!=null){

if(bas==null){
son=gelen;
bas=gelen;
}
else {
    if(tmp.der>gelen.der){
son.ileri=gelen;
son=gelen;
}System.out.print(gelen.der+" "+gelen.kats+"===>"); tmp=tmp.ileri;
}

}

}


    public static void main(String[] args) {
        bliste b=new bliste();
        b.sonaekle(new polinom(4,6));
        b.sonaekle(new polinom(8,4));
        b.sonaekle(new polinom(2,0));
        b.hesapla(2); 
    }
}
