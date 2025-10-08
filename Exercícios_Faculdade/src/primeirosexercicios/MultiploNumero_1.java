//ser múltiplo de algum número

final int valor = 7;

void main(){
    for(int i = 1; i < 1000; i++) {

        if (i % valor == 0){
            System.out.println(i);
        }
    }
}