<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_FluxCapacitor_Cageman.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>362</x>
        <y>261</y>
        <position>
          <x>362</x>
          <y>261</y>
        </position>
        <center>
          <x>459</x>
          <y>325.5</y>
        </center>
        <min>
          <x>362</x>
          <y>261</y>
        </min>
        <max>
          <x>556</x>
          <y>390</y>
        </max>
        <width>194</width>
        <height>129</height>
        <size>
          <x>194</x>
          <y>129</y>
        </size>
        <xMin>362</xMin>
        <yMin>261</yMin>
        <xMax>556</xMax>
        <yMax>390</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>This should be the location of the George Cageman raiders.

After inspecting the area, you've identified their base of operations and discovered that there is a small squad of vehicles protecting the outskirts, whilst a larger group defends the base.

You'll have to fight both of these groups.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Raiders</enemyType>
              <difficulty>-5</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Let's do it!</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>109</y>
                <position>
                  <x>182</x>
                  <y>109</y>
                </position>
                <center>
                  <x>187</x>
                  <y>114</y>
                </center>
                <min>
                  <x>182</x>
                  <y>109</y>
                </min>
                <max>
                  <x>192</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>109</yMin>
                <xMax>192</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_Cageman2</nodeName>
              <nodeDiscription>You've scouted the base of the raiders led by George Cageman. It looked like it was defended by two squads of vehicles.

Defeating them will require you to defeat both of these groups in quick succession.

The professor promised to give you a Flux Capacitor once completed.</nodeDiscription>
              <pos>Distance</pos>
              <distance>1</distance>
            </ButtonAction>
          </Actions>
          <Name>Come back later.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>473</x>
        <y>551</y>
        <position>
          <x>473</x>
          <y>551</y>
        </position>
        <center>
          <x>570</x>
          <y>601</y>
        </center>
        <min>
          <x>473</x>
          <y>551</y>
        </min>
        <max>
          <x>667</x>
          <y>651</y>
        </max>
        <width>194</width>
        <height>100</height>
        <size>
          <x>194</x>
          <y>100</y>
        </size>
        <xMin>473</xMin>
        <yMin>551</yMin>
        <xMax>667</xMax>
        <yMax>651</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>You've managed to defeat the small squad of vehicles that were defending the outskirts of George Cageman's base.

Looks like you got their attention, as the larger force is coming your way!</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>65</y>
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_CagemanEnd</nodeName>
              <nodeDiscription>You've managed to defeat the small squad of vehicles that were defending the outskirts of George Cageman's base.

Looks like you got their attention, as the larger force is coming your way!</nodeDiscription>
              <pos>SameAs</pos>
              <posSameAs>Q_FluxCapacitor_Cageman</posSameAs>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Let them come.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_FluxCapacitor_Cageman</Name>
</Scenario>