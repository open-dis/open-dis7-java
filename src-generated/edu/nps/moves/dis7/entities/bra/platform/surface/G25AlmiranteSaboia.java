package edu.nps.moves.dis7.entities.bra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@59f99ea;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32640
 */
public class G25AlmiranteSaboia extends EntityType
{
    /** Default constructor */
    public G25AlmiranteSaboia()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)55); // uid 32638, Amphibious Cargo Ship
        setSubCategory((byte)1); // uid 32639, Round Table Class
        setSpecific((byte)1); // uid 32640, G25 Almirante Saboia
    }
}
