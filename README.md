## Architecture

#### Model Layer
Player
| #ArrayList heroArray

Hero(Abstract)
| #String name
| #String class
| #integer level
| #integer experience
| #float attack
| #float defense
| #float hit_point
| #ArrayList artifactArray


Artifact(Abstract)
| #String type
| #String name
| +add_artifact
| +remove_artifact

Weapon: Artifact
| #String name
| #float attack_increase

Armor: Artifact
| #String name
| #float defense_increase

Helm: Artifact
| #String name
| #float hit_point_increase

Villain
| #String name
| #float attack
| #float defense
| #float hit_point

Map
| # char[][] map_array

Battle
| ===

### Repository Layer
PlayerRepository
HeroRepository
ArtifactRepository

### View Layer
- one view to create welcome page
- another view to create map page
- view to create battle page

### Controller Layer
TopController
MapController
BattleController

### Service Layer
HeroFactory(Singleton)
| +makeHero(String type): Hero

VillainFactory(Singleton)
| +makeVillain(String type): Villain

ArtifactFactory(Singleton)
| +makeArtifact(String type): Artifact