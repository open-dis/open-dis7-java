package edu.nps.moves.dis7.entities.deu.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@30e868be;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SPACE;
 *
 * Entity type uid: 16851
 */
public class ShuttlePalletSPAS extends EntityType
{
    /** Default constructor */
    public ShuttlePalletSPAS()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 16811, Unmanned
        setSubCategory((byte)16); // uid 16850, Miscellaneous
        setSpecific((byte)1); // uid 16851, Shuttle Pallet (SPAS)
    }
}
