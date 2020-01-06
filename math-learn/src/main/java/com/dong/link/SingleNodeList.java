package com.dong.link;

/**
 * 单链表设置
 */
public class SingleNodeList {

    private int size;

    private Node   nodeHead;


    private class Node{
        private Object  objectData;//存放节点数据
        private Node  next;//存放下一个节点地址

        public Object getObjectData() {
            return objectData;
        }

        public void setObjectData(Object objectData) {
            this.objectData = objectData;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public SingleNodeList(){
        this.size = 0;
        this.nodeHead = null;
    }

    public int addNodeData(Object object){
        Node  nodeData = new Node();
        nodeData.setObjectData(object);
        if (object != null){
            if (nodeHead == null){
                //说明链表头为空
                nodeHead = nodeData;//此时next存为null
            }else{//链表头不为空,支持在原链表头后追加节点元素
                Node tempNode = nodeHead.getNext();
                if(tempNode == null){
                    nodeHead.setNext(nodeData);
                }else{
                    Node  innerTempNode =  tempNode.getNext();
                    if(innerTempNode != null){
                        while(innerTempNode != null){
                            if(innerTempNode.getNext() != null){
                                innerTempNode  = innerTempNode.getNext();
                            }else{
                                break;
                            }
                        }
                        innerTempNode.setNext(nodeData);
                    }else{
                        tempNode.setNext(nodeData);
                    }
                }
            }
            size ++;
            return size;//增加完之后返回链表元素的大小
        }
        return -1;
    }

    //遍历链表中的数据
    public void printDataMessage(){
        if (size>=1){
            System.out.println("链表头部数据为:"+nodeHead.getObjectData()+"===>");
            Node tempNodeData = nodeHead.getNext();
            while(tempNodeData!=null){
                System.out.println("====>下个节点数据为:"+tempNodeData.getObjectData());
                tempNodeData = tempNodeData.getNext();
            }
        }else {
            System.out.println("无节点数据！！！");
        }

    }

    public static void main(String[] args) {
        SingleNodeList  singleNodeList = new SingleNodeList();
        System.out.println(singleNodeList.addNodeData("aa"));
        System.out.println(singleNodeList.addNodeData("bb"));
        System.out.println(singleNodeList.addNodeData("cc"));
        System.out.println(singleNodeList.addNodeData("dd"));
        System.out.println(singleNodeList.addNodeData("ee"));
        System.out.println(singleNodeList.addNodeData("ff"));
        System.out.println(singleNodeList.addNodeData("gg"));
        System.out.println(singleNodeList.addNodeData("hh"));
        System.out.println(singleNodeList.size);
        singleNodeList.printDataMessage();
    }
}
