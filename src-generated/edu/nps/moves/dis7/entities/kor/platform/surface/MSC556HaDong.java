package edu.nps.moves.dis7.entities.kor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@72e34f77;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17705
 */
public class MSC556HaDong extends EntityType
{
    /** Default constructor */
    public MSC556HaDong()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 17691, Mine Countermeasure Ship/Craft
        setSubCategory((byte)3); // uid 17703, US MSC 389 Class (minesweeper-coastal)
        setSpecific((byte)2); // uid 17705, MSC 556 Ha Dong
    }
}
