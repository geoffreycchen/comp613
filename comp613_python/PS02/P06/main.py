from typing import *

class TreeNode:
    def __init__(self, value: int, children: List['TreeNode']):
        self.value = value
        self.children = children


def sum_tree(tn: TreeNode) -> int:
    """Calculate the sum of all values in the tree."""
    if tn is None:
        return 0

    children_sum = sum(sum_tree(child) for child in tn.children)

    return tn.value + children_sum



root = TreeNode(3, [
    TreeNode(4, [
        TreeNode(9, []),
        TreeNode(10, [])
    ]),
    TreeNode(5, [
        TreeNode(6, []),
        TreeNode(35, [])
    ])
])

total_sum = sum_tree(root)
print(total_sum)