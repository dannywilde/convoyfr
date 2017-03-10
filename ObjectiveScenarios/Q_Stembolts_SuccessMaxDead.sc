<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_Stembolts_SuccessMaxDead.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>80</x>
        <y>281</y>
        <center>
          <x>184</x>
          <y>331</y>
        </center>
        <width>208</width>
        <height>100</height>
        <xMin>80</xMin>
        <yMin>281</yMin>
        <xMax>288</xMax>
        <yMax>381</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You arrive at the Eiffels Incorporated office and are told that you were expected.

Once again, you are led into the meeting room where Samuel and Maxwell are waiting for you.
</Text>
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
                <x>196</x>
                <y>65</y>
                <center>
                  <x>201</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>196</xMin>
                <yMin>65</yMin>
                <xMax>206</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>The old man is dead.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>226</x>
        <y>622</y>
        <center>
          <x>301</x>
          <y>672</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>226</xMin>
        <yMin>622</yMin>
        <xMax>376</xMax>
        <yMax>722</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>[0loot]</Text>
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
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Take loot</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>398</x>
        <y>222</y>
        <center>
          <x>485</x>
          <y>272</y>
        </center>
        <width>174</width>
        <height>100</height>
        <xMin>398</xMin>
        <yMin>222</yMin>
        <xMax>572</xMax>
        <yMax>322</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Wonderful news! Very well done. I suppose that nullifies the need for the deed entirely!"

"Jolly good show, old chap!"

"Naturally, we shall uphold our end of the bargain. We are trustworthy businessmen after all."

"Your stem bolts are being delivered to your convoy as we speak."

"Pleasure doing business with you, goodbye!"

Before you have a chance to say anything in return, you are led outside the office building.</Text>
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
                <x>162</x>
                <y>65</y>
                <center>
                  <x>167</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>162</xMin>
                <yMin>65</yMin>
                <xMax>172</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Damn businessmen...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>668</x>
        <y>290</y>
        <center>
          <x>743</x>
          <y>340</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>668</xMin>
        <yMin>290</yMin>
        <xMax>818</xMax>
        <yMax>390</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>A large cargo of stem bolts is loaded on to your convoy, they should be more than sufficient for your spaceship.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddCargo">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>138</x>
                <y>65</y>
                <center>
                  <x>143</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>138</xMin>
                <yMin>65</yMin>
                <xMax>148</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Move out!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_Stembolts_SuccessMaxDead</Name>
</Scenario>