package edu.nps.moves.dis7.entities.csk.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@74f0ea28;
 * Country: Czechoslovakia (CSK);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 25375
 */
public class Sojka extends EntityType
{
    /** Default constructor */
    public Sojka()
    {
        setCountry(Country.ACTION_REQUEST_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 25374, Unmanned
        setSubCategory((byte)1); // uid 25375, Sojka
    }
}
