package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5ba23b66;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 25240
 */
public class OR304Success extends EntityType
{
    /** Default constructor */
    public OR304Success()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17594, Auxiliary
        setSubCategory((byte)3); // uid 17599, Durance class (Underway Replenishment Tanker) AOR
        setSpecific((byte)1); // uid 25240, OR 304 Success
    }
}
