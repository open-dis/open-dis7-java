package edu.nps.moves.dis7.entities.kor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3a1d593e;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17679
 */
public class PGM587PaeKu57 extends EntityType
{
    /** Default constructor */
    public PGM587PaeKu57()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17673, Light/Patrol Craft
        setSubCategory((byte)1); // uid 17674, Pae Ku (PSMM 5) Class (fast attack craft-missile)
        setSpecific((byte)5); // uid 17679, PGM 587 Pae Ku 57
    }
}
