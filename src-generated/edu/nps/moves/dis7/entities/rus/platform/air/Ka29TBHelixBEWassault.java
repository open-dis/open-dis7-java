package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@796065aa;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 13470
 */
public class Ka29TBHelixBEWassault extends EntityType
{
    /** Default constructor */
    public Ka29TBHelixBEWassault()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 13431, Utility helicopter
        setSubCategory((byte)9); // uid 13466, KA-27/28/29/31 Helix
        setSpecific((byte)4); // uid 13470, Ka-29TB Helix B (EW & assault)
    }
}
