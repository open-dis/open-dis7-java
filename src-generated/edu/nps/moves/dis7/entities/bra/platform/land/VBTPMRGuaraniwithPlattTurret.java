package edu.nps.moves.dis7.entities.bra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6574b225;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32018
 */
public class VBTPMRGuaraniwithPlattTurret extends EntityType
{
    /** Default constructor */
    public VBTPMRGuaraniwithPlattTurret()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 25690, Armored Fighting Vehicle
        setSubCategory((byte)5); // uid 32017, VBTP-MR Guarani
        setSpecific((byte)1); // uid 32018, VBTP-MR Guarani with Platt Turret
    }
}
