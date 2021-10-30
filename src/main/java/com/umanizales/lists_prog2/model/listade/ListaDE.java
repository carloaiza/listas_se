package com.umanizales.lists_prog2.model.listade;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.umanizales.lists_prog2.model.Boy;

@Data
@NoArgsConstructor
public class ListaDE {
    private Node head;
    private int count;

    public void add(Boy boy)
    {
        if(this.head!=null)
        {
            Node temp = this.head;
            while(temp.getNext()!=null)
            {
                temp = temp.getNext();
            }
            Node newBoy= new Node(boy);
            temp.setNext(newBoy);
            newBoy.setPrevious(temp);
        }
        else
        {
            //NO hay datos
            this.head= new Node(boy);
        }
    }
}
