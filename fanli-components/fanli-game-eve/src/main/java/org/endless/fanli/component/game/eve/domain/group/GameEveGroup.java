package org.endless.fanli.component.game.eve.domain.group;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * GameEveGroup
 * <p>
 * <p>
 * <p>
 * <p>create 2024/2/4 18:10
 * <p>update 2024/2/4 18:10
 *
 * @author Deng Haozhi
 * @since 0.0.6
 */
@Getter
@Builder
@ToString
public class GameEveGroup {

    private String groupId;
    private String categoryId;
    private String groupName;
    private boolean published;
    private List<String> items;
}