package setOfCards;

class Card implements Comparable<Card>{
    private String symbol;
    private int number;

    public Card(String symbol,int number){
        this.number=number;
        this.symbol=symbol;
    }

    public String getSymbol(){
        return this.symbol;
    }

    public int getNumber(){
        return this.number;
    }

    @Override
    public int compareTo(Card o) {
        String symbol=o.getSymbol();
        if(this.symbol.compareTo(symbol) > 0){
            return 1;
        }else{
            return -1;
        }
    }
}