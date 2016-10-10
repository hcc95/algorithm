package com.cdut.test;

import java.util.List;

import com.cdut.datastructure.TreeParent;
import com.cdut.datastructure.TreeParent.Node;

public class TreeParentTest {
	public static void main(String[] args) {
		TreeParent<String> tp=new TreeParent<String>("root");
		Node<String> root=tp.root();
		tp.addNode("节点一", root);
		System.out.println("此树的深度:"+tp.deep());
		tp.addNode("节点二", root);
		List<TreeParent.Node<String>> nodes=tp.children(root);
		System.out.println(nodes.get(0));
		tp.addNode("节点三", nodes.get(0));
		System.out.println("此树的深度:"+tp.deep());
		List<TreeParent.Node<String>> nodes1=tp.children(nodes.get(0));
		System.out.println(nodes1);
	}
}
