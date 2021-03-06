package edu.nps.moves.dis7.entities.srb.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@a565cbd;
 * Country: Serbia (SRB);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 31867
 */
public class UTVAKobac extends EntityType
{
    /** Default constructor */
    public UTVAKobac()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 31866, Attack/Strike
        setSubCategory((byte)1); // uid 31867, UTVA Kobac
    }
}
