<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_Hyperdrive_RaiderChase2.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>248</x>
        <y>244</y>
        <center>
          <x>323.5</x>
          <y>295.5</y>
        </center>
        <width>151</width>
        <height>103</height>
        <xMin>248</xMin>
        <yMin>244</yMin>
        <xMax>399</xMax>
        <yMax>347</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Vous avez rattrapé les raiders responsables de la destruction de Whiteborough!

Les yeux d'Andy s'illuminent. - Abattez-les!"</Text>
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
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
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
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Attaquez!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>303</x>
        <y>572</y>
        <center>
          <x>383.5</x>
          <y>632.5</y>
        </center>
        <width>161</width>
        <height>121</height>
        <xMin>303</xMin>
        <yMin>572</yMin>
        <xMax>464</xMax>
        <yMax>693</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>Avec le dernier véhicule raider détruit, vous espérez que les corps des citoyens décédés de Whiteborough reposerons en paix.

[0loot]</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>149</x>
                <y>65</y>
                <center>
                  <x>154</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>149</xMin>
                <yMin>65</yMin>
                <xMax>159</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>On a fini, Andy?</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>558</x>
        <y>462</y>
        <center>
          <x>655</x>
          <y>512</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>558</xMin>
        <yMin>462</yMin>
        <xMax>752</xMax>
        <yMax>562</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Nous y voila, Ô mon frère.

Ramenez moi au bar à lait Sasiak, je vous fournirai votre précieux Hyperdrive Stabilizers."</Text>
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
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Hyperdrive_Reward</nodeName>
              <nodeDiscription>Vous avez trainé les raiders responsables du massacre de Whiteborough devant la justice..

Andy a promis de vous donner le Hyperdrive Stabilizers dès que vous l'aurez ramené au bar à lait Sasiak.</nodeDiscription>
              <pos>SameAs</pos>
              <posSameAs>Q_M_S_Hyperdrive</posSameAs>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Direction le bar à lait!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_Hyperdrive_RaiderChase2</Name>
</Scenario>