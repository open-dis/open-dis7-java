package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@19bb089b;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29757
 */
public class MexefloteStandard extends EntityType
{
    /** Default constructor */
    public MexefloteStandard()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 17585, Landing Craft
        setSubCategory((byte)3); // uid 29756, Mexeflote - Landing Raft
        setSpecific((byte)1); // uid 29757, Mexeflote Standard
    }
}
