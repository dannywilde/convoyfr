<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Boss</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/Scenarios/EndLevel.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>123</x>
        <y>205</y>
        <position>
          <x>123</x>
          <y>205</y>
        </position>
        <center>
          <x>204</x>
          <y>255.5</y>
        </center>
        <min>
          <x>123</x>
          <y>205</y>
        </min>
        <max>
          <x>285</x>
          <y>306</y>
        </max>
        <width>162</width>
        <height>101</height>
        <size>
          <x>162</x>
          <y>101</y>
        </size>
        <xMin>123</xMin>
        <yMin>205</yMin>
        <xMax>285</xMax>
        <yMax>306</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>As you near your spaceship, ready to fix it up and leave this planet once and for all, you spot an enormous hovering battlemachine.

"You have made quite a name for yourself on Omek Prime, fighting the different factions with blatant disregard for the established distribution of power.

Your meddling in our affairs ends now!"

Two smaller vehicles move in to flank you as the monstrosity powers up its weapons and approaches, you have no choice but to fight!
</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="SpawnBoss">
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
            </ButtonAction>
          </Actions>
          <Name>Start Battle!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>124</x>
        <y>351</y>
        <position>
          <x>124</x>
          <y>351</y>
        </position>
        <center>
          <x>202.5</x>
          <y>401.5</y>
        </center>
        <min>
          <x>124</x>
          <y>351</y>
        </min>
        <max>
          <x>281</x>
          <y>452</y>
        </max>
        <width>157</width>
        <height>101</height>
        <size>
          <x>157</x>
          <y>101</y>
        </size>
        <xMin>124</xMin>
        <yMin>351</yMin>
        <xMax>281</xMax>
        <yMax>452</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>The blinding light and deafening explosion fade out and a peaceful silence settles over Omek Prime.

With the monstrous battlemachine destroyed, the way is clear for you to return to Spaceship Mercury and finally leave this planet.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>145</x>
                <y>65</y>
                <position>
                  <x>145</x>
                  <y>65</y>
                </position>
                <center>
                  <x>150</x>
                  <y>70</y>
                </center>
                <min>
                  <x>145</x>
                  <y>65</y>
                </min>
                <max>
                  <x>155</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>145</xMin>
                <yMin>65</yMin>
                <xMax>155</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Continue.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>386</x>
        <y>296</y>
        <position>
          <x>386</x>
          <y>296</y>
        </position>
        <center>
          <x>461</x>
          <y>346</y>
        </center>
        <min>
          <x>386</x>
          <y>296</y>
        </min>
        <max>
          <x>536</x>
          <y>396</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>386</xMin>
        <yMin>296</yMin>
        <xMax>536</xMax>
        <yMax>396</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The collected parts prove operational enough for Spaceship Mercury to take off.

You leave your escort vehicles behind, thank everyone for their help and load your MCV onto the spaceship.

One can only guess what will happen to Omek Prime, now that it's supposed Keepers have been destroyed. But you have no time to worry about it.

The next mission awaits.

The days of driving a convoy are over.

The Endless War of Landinar awaits.

 

</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="EndGame">
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
              <victory>true</victory>
            </ButtonAction>
          </Actions>
          <Name>End game.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>EndLevel</Name>
</Scenario>