class Message{
    public String from;
    public String to;
    public String message;

    public Message(){
        
    }

    public Message(String from,String to,String message){
        this.from = from;
        this.to = to;
        this.message = message;
    }

    public void setFrom(String from){
        this.from = from;
    }

    public void setTo(String to){
        this.to = to;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getFrom(){
        return this.from;
    }

    public String getTo(){
        return this.to;
    }

    public String getMessage(){
        return this.message;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("From --------- "+this.from);
        sb.append("To ------------ "+this.to);
        sb.append("Message ----- "+this.message);
        return new String(sb);
    }

}