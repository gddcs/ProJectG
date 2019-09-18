package com.example.projectg

import org.junit.Test
import java.lang.Exception

/**
 * @author GDDCS
 * create at 2019/9/18 13:56
 * description:
 */
class OfferTest {

    @Test
    fun test(){
        val head : LinkedNode = LinkedNode(0)
        head.next = LinkedNode(1)
        head.next!!.next = LinkedNode(2)
        head.next!!.next!!.next = LinkedNode(3)

        printNode(head)
        printNode(reverseLinked(head))

    }

    fun reverseLinked(head : LinkedNode) : LinkedNode{
        if (head != null ){
            if (head.next == null){
                // 只有一个节点
                return head
            }else{
                var reverseNode : LinkedNode? = null
                var cur : LinkedNode? = head
                var curPre : LinkedNode?= null
                while (cur != null){
                    val tempNext = cur.next
                    if (tempNext == null){
                        reverseNode = cur
                    }

                    cur.next = curPre
                    curPre = cur
                    cur = tempNext

                }
                return reverseNode!!
            }
        }else{
            throw Exception("error ! head == null")
        }
    }

    fun printNode(head : LinkedNode){
        var temp : LinkedNode = head
       while(temp.next != null) {
           System.out.println(temp.value)
           temp = temp.next!!
       }
        System.out.println(temp.value)
    }
}