package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4563e9ab;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29758
 */
public class MexefloteLarger extends EntityType
{
    /** Default constructor */
    public MexefloteLarger()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 17585, Landing Craft
        setSubCategory((byte)3); // uid 29756, Mexeflote - Landing Raft
        setSpecific((byte)2); // uid 29758, Mexeflote Larger
    }
}
