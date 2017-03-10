﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/ObjectiveScenarios/G_BeardedBunnies.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>174</x>
        <y>175</y>
        <position>
          <x>174</x>
          <y>175</y>
        </position>
        <center>
          <x>249.5</x>
          <y>225</y>
        </center>
        <min>
          <x>174</x>
          <y>175</y>
        </min>
        <max>
          <x>325</x>
          <y>275</y>
        </max>
        <width>151</width>
        <height>100</height>
        <size>
          <x>151</x>
          <y>100</y>
        </size>
        <xMin>174</xMin>
        <yMin>175</yMin>
        <xMax>325</xMax>
        <yMax>275</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>As you arrive in the area where the Bearded Bunny Raiders operate, it seems they've found you first.

Several vehicles, sporting the bearded rabbit logo, approach your convoy agressively.</Text>
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
              <difficulty>-3</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Defend yourself!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>225</x>
        <y>431</y>
        <position>
          <x>225</x>
          <y>431</y>
        </position>
        <center>
          <x>322</x>
          <y>481</y>
        </center>
        <min>
          <x>225</x>
          <y>431</y>
        </min>
        <max>
          <x>419</x>
          <y>531</y>
        </max>
        <width>194</width>
        <height>100</height>
        <size>
          <x>194</x>
          <y>100</y>
        </size>
        <xMin>225</xMin>
        <yMin>431</yMin>
        <xMax>419</xMax>
        <yMax>531</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>Just as you're trying to recover from the fight, you spot more vehicles approaching from the distance.

"Come see how far down this rabbit hole goes!"</Text>
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
              <nodeName>G_BeardedBunnies2</nodeName>
              <nodeDiscription>You've survived the attacking Bearded Bunnies, but more are inbound!</nodeDiscription>
              <pos>SameAs</pos>
              <posSameAs>G_BeardedBunnies</posSameAs>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Attack formations!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>G_BeardedBunnies</Name>
</Scenario>