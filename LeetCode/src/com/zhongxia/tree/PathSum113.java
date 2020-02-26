package com.zhongxia.tree;
import java.util.ArrayList;
import java.util.List;
public class PathSum113 {
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

            List<List<Integer>> paths = new ArrayList<List<Integer>>();
            go(root, 0, sum, new ArrayList<Integer>(), paths);
            return paths;
        }

        void go(TreeNode node,int sum,int target,ArrayList<Integer> path,List<List<Integer>> paths){
            if(node==null)
                return;
            //�൱�ڸ������ۼ�sum
            sum+=node.val;
            //����ջ��
            path.add(node.val);
            //���ΪҶ�ӽڵ㣬sum=target��������ջ
            if(sum==target&&node.left==null&&node.right==null){
                paths.add(new ArrayList<Integer>(path));
            }else{
                //�ݹ�
                go(node.left,sum,target,path,paths);
                go(node.right,sum,target,path,paths);
            }
            //���ݵ���һ����Ȼ��Ѽ����ɾ����remove��
            sum-=node.val;
            path.remove(path.size()-1);
        }
    }

