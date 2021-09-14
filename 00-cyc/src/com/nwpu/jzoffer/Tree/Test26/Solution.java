package com.nwpu.jzoffer.Tree.Test26;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 19:40 2021/9/9
 * @Modified By:
 */
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
       if( pNode.right != null){
           TreeLinkNode node = pNode.right;
           while( null != node.left ){
               node = node.left;
           }
           return  node;
       }
       else{
           while( null != pNode.next){
               TreeLinkNode parent = pNode.next;
               if( pNode == parent.left){
                   return parent;
               }
               pNode = pNode.next;
           }
       }
       return null;
    }
}