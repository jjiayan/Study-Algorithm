def solution(info, edges):
    n = len(info)
    edge = dict()
    for k, v in edges:
        if k in edge:
            edge[k].append(v)
        else:
            edge[k] = [v]
    max_sheep = 0
    
    def dfs(able, sheep, wolf):
        
        nonlocal max_sheep
        max_sheep = max(max_sheep, sheep)
        
        for cur in able:
            tmp = set(able)
            tmp.remove(cur)
            if edge.get(cur, 0):
                tmp.update(edge[cur])
            new_able = list(tmp)
            if info[cur]:
                new_wolf = wolf + 1
                new_sheep = sheep
            else:
                new_wolf = wolf 
                new_sheep = sheep + 1
            if new_wolf >= new_sheep:
                continue
            dfs(new_able, new_sheep, new_wolf)

    dfs([0], 0, 0)
    return max_sheep
    